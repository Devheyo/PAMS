package com.plz.pams.mapper;

import com.plz.pams.vo.MainVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
    List<MainVO> selectAll();
}
