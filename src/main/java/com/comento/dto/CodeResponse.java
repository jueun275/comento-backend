package com.comento.dto;

import com.comento.vo.CodeVO;
import lombok.Data;

import java.util.List;

@Data
public class CodeResponse {
    private List<CodeVO> list;
}
