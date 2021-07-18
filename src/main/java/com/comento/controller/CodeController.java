package com.comento.controller;

import com.comento.dto.CodeRequest;
import com.comento.dto.CodeResponse;
import com.comento.dto.NoticeRequest;
import com.comento.dto.NoticeResponse;
import com.comento.service.CodeService;
import com.comento.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/code")
public class CodeController {

    final private CodeService service;

    @GetMapping("selectCodeInfo")
    @CrossOrigin
    public ResponseEntity<?> selectCode() throws Exception {
        CodeResponse data = new CodeResponse();
        data.setList(service.selectCodeList());
        return new ResponseEntity(data, HttpStatus.OK);
    }

    @PostMapping("selectCodeList/{request}")
    @CrossOrigin
    public ResponseEntity<?> findCodeById(@PathVariable String request) throws Exception {
        CodeResponse data = new CodeResponse();
        data.setList(service.selectDetailCode(request));
        return new ResponseEntity(data, HttpStatus.OK);
    }
}
