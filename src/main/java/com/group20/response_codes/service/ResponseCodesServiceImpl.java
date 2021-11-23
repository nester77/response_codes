package com.group20.response_codes.service;

import com.group20.response_codes.entity.ResponseCodes;
import com.group20.response_codes.repository.ResponseCodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseCodesServiceImpl implements ResponseCodesService{

    private ResponseCodesRepository responseCodesRepository;

    @Autowired
    public ResponseCodesServiceImpl(ResponseCodesRepository responseCodesRepository) {
        this.responseCodesRepository = responseCodesRepository;
    }


    @Override
    public List<ResponseCodes> getRandomResponseCodes(String status) {
       List<ResponseCodes> responseCodes = responseCodesRepository.findAll();



        return null;
    }

    @Override
    public List<ResponseCodes> findAll() {
        return null;
    }


}
