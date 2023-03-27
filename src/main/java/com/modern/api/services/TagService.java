package com.modern.api.services;

public interface TagService {
    Map<String, List<Tag>> getTags(List<String> productIds);
}