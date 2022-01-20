package com.group20.response_codes.service;

import com.group20.response_codes.entity.ResponseCodes;
import com.group20.response_codes.repository.ResponseCodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ResponseCodesServiceImpl implements ResponseCodesService {

    private ResponseCodesRepository responseCodesRepository;

    @Autowired
    public ResponseCodesServiceImpl(ResponseCodesRepository responseCodesRepository) {
        this.responseCodesRepository = responseCodesRepository;
    }


    @Override
    public HashSet<ResponseCodes> getRandomResponseCodes(String status) {
        List<ResponseCodes> responseCodes;

        if (status == null) {
            responseCodes = responseCodesRepository.findAll();
        } else {
            responseCodes = responseCodesRepository.randomResponseCodes(status);
        }

        HashSet<ResponseCodes> randomResponseCodes = new HashSet<>();


        while (randomResponseCodes.size() < 3) {
            int a = (int) (Math.random() * (responseCodes.size()));
            randomResponseCodes.add(responseCodes.get(a));
        }
        return randomResponseCodes;
    }

    @Override
    public List<ResponseCodes> findAll() {
        List<ResponseCodes> responseCodes = responseCodesRepository.findAll();
        return responseCodes;
    }


}
