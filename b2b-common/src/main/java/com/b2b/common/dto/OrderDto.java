package com.b2b.common.dto;

public record OrderDto(Long id, String orderNo, Long userId, String username, String status) {
}
