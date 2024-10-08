package com.booknic.controller;

import static com.booknic.api.LibApi.EndPoint.*;

import com.booknic.entity.Library;
import com.booknic.entity.User;
import com.booknic.repository.LibraryRepository;
import com.booknic.repository.UserRepository;
import com.booknic.service.LibraryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://localhost:3000")
@RequiredArgsConstructor
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/lib")
    public ResponseEntity<?> getLibrary(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, LIBSRCH.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }

    @GetMapping("/item")
    public ResponseEntity<?> getItem(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, ITEMSRCH.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/loanitem")
    public ResponseEntity<?> getLoanItem(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, LOANITEMSRCH.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/recommend")
    public ResponseEntity<?> getRecommend(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, RECOMMANDLIST.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/detail")
    public ResponseEntity<?> getDetail(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, SRCHDTLLIST.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/analysis")
    public ResponseEntity<?> getAnalysis(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, USAGEANALYSISLIST.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/loanitemlib")
    public ResponseEntity<?> getLoanItemByLib(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, LOANITEMSRCHBYLIB.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/trend")
    public ResponseEntity<?> getTrend(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, USAGETREND.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/exist")
    public ResponseEntity<?> getExist(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, BOOKEXIST.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/hot")
    public ResponseEntity<?> getHotTrend(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, HOTTREND.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/libsrchbook")
    public ResponseEntity<?> getLibSrchByBook(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, LIBSRCHBYBOOK.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/extends/libsrch")
    public ResponseEntity<?> getExLibSrch(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, EXTENDLIBSRCH.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/extends/loanitemlib")
    public ResponseEntity<?> getExLoanItemByLib(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, EXTENDLOANITEMSRCHBYLIB.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/srchbooks")
    public ResponseEntity<?> getSrchBooks(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, SRCHBOOKS.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
    @GetMapping("/keyword")
    public ResponseEntity<?> getKeyword(@RequestParam Map<String, String> params) throws URISyntaxException {
        List<?> libInfo = LibraryService.getLibInfo(params, MONTHLYKEYWORDS.getEndPoint());
        return ResponseEntity.ok().body(libInfo);
    }
}
