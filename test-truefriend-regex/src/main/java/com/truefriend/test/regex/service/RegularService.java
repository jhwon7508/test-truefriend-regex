package com.truefriend.test.regex.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegularService {

    public String convert(String address) {

        String result = "결과를 찾지 못하였습니다";

//        String koreanPattern = "^[가-힣]*$";
        String addressPattern = "((([가-힣]+(d|d(,|.)d|)+(읍|면|동|가|리))(^구|)((d(~|-)d|d)(가|리|)|))([ ](산(d(~|-)d|d))|)|(([가-힣]|(d(~|-)d)|d)+(로|길)))";

        Pattern pattern = Pattern.compile(addressPattern);
        Matcher matcher = pattern.matcher(address);

        if(matcher.find()==true) {
            result = matcher.group();
        }

        return result;
    }

}
