package com.prescription.proj.service;

import com.prescription.proj.dao.PathologyDao;
import com.prescription.proj.domain.PathologyReport;
import com.prescription.proj.domain.Test;
import com.prescription.proj.helper.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PathologyService {

    private final PathologyDao pathologyDao;

    @Autowired
    public PathologyService(PathologyDao pathologyDao) {
        this.pathologyDao = pathologyDao;
    }

    public void save(Test test) {
        if (test.getId() != 0) {
            pathologyDao.merge(test);
        } else {
            test.setCreatedBy(Constants.getUser());
            test.setCreatedOn(new Date());
            pathologyDao.save(test);
        }
    }

    public void save(PathologyReport report, long testId) {
        if (report.getId() != 0) {
            pathologyDao.merge(report);
        } else {
            report.setCreatedBy(Constants.getUser());
            report.setCreatedOn(new Date());

            Test test = getTest(testId);
            test.setActive(false);
            save(test);

            pathologyDao.save(report);
        }
    }

    public List<Test> getAllPendingTests() {
        return pathologyDao.getAllTests();
    }

    public Test getTest(long testId) {
        return pathologyDao.getTest(testId);
    }
}
