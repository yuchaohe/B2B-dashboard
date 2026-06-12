package com.b2b.order.controller;

import com.b2b.common.dto.OrderDto;
import com.b2b.common.dto.UserDto;
import com.b2b.order.client.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final UserClient userClient;

    public OrderController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/{id}")
    public OrderDto getOrder(@PathVariable Long id) {
        long userId = (id % 5) + 1;
        UserDto user = userClient.getUser(userId);
        return new OrderDto(id, "ORD-" + id, userId, user.username(), "CREATED");
    }
}
