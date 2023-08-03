package com.example.kakao.order;

import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderRestController {


    private OrderRestController orderService;

    // (기능9) 결재하기 - (주문 인서트) POST
    // /orders/save
    @PostMapping("/orders/save")
    public ResponseEntity<?> save(@PathVariable int id) {
        ResponseEntity<?> responseDTO = orderService.save(id);
        return ResponseEntity.ok(ApiUtils.success(responseDTO));
    }

    // (기능10) 주문 결과 확인 GET
    // /orders/{id}
    @GetMapping("/orders/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        ResponseEntity<?> responseDTO = orderService.findById(id);
        return ResponseEntity.ok(ApiUtils.success(responseDTO));
    }

}
