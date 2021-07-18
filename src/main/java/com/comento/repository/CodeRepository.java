package com.comento.repository;

import com.comento.dto.CodeRequest;
import com.comento.vo.CodeVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CodeRepository {
    public List<CodeVO> selectCodeList();
    public List<CodeVO> selectDetailCode(String request);
}
