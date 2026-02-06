package com.swg.email.dto;

import lombok.Data;

@Data//for getter setter from lombok
public class EmailRequest {

    private String emailContent;
    private String tone;

}
