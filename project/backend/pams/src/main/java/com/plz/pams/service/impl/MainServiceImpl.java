package com.plz.pams.service.impl;

import com.plz.pams.mapper.MainMapper;
import com.plz.pams.service.MainService;
import com.plz.pams.vo.MainVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    MainMapper mainMapper;

    @Override
    public List<MainVO> selectAll() {
        List<MainVO> resultList = new ArrayList<MainVO>();
        resultList = mainMapper.selectAll();
        return null;
    }
}
