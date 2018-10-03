package com.rookout.test.service;

import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;

import org.springframework.stereotype.Service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by shelly on 03/10/2018.
 */
@Slf4j
@Service
public class MyService {
    
    public String hash(List<String> fields) {
        log.info("Got fields {}", fields);
        Hasher hasher = Hashing.murmur3_128().newHasher();
        
        for (String field : fields) {
            hasher.putString(field.replaceAll("\\s+", ""));
        }
        
        return hasher.hash().toString();
    }

}
