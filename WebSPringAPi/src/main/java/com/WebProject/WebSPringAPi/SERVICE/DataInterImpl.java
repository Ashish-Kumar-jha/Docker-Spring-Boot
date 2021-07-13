package com.WebProject.WebSPringAPi.SERVICE;

import com.WebProject.WebSPringAPi.DAO.DataDao;
import com.WebProject.WebSPringAPi.ENTITY.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataInterImpl implements  DataInter{
    @Autowired
    DataDao dataDao;

    @Override
    public List<Data> showData() {
        return dataDao.findAll();
    }

//    @Override
//    public Data addUser(Data dataobj) {
//        return dataDao.save(dataobj);
//    }

}
