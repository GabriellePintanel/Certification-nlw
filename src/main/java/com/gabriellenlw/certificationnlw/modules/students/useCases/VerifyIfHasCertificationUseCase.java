package com.gabriellenlw.certificationnlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.gabriellenlw.certificationnlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute( VerifyHasCertificationDTO dto){
            if(dto.getEmail().equals("gabriellepintanel@gmail.com") && dto.getTechnology().equals("JAVA")){
                return true;
            }
            return false;

    }
}
