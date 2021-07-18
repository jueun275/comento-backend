package com.comento.dto;

import com.comento.vo.CodeVO;
import lombok.Data;

import java.util.List;

@Data
public class CodeResponse {
    private List<CodeVO> list;

    private String cdId;
    private String cdNm;
    private String cdEng;
    private String cdSort;
    private String cdUseYn;
    private String conn1Cd;
    private String conn2Cd;
    private String conn3Cd;
}
