package edu.wgu.d387_sample_code.internationalization;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TZConvertController {

    @GetMapping("/presentation")
    public ResponseEntity<String> announcePresentation() {
        String announcement = "ATTENTION: There is a presentation beginning at: " + TZConvert.getTime();
        return new ResponseEntity<String> (announcement, HttpStatus.OK);
    }
}
