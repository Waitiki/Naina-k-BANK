package com.Nainak.nainakbankingapp.service;

import com.Nainak.nainakbankingapp.DTO.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);

}
