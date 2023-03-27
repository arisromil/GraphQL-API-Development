package com.modern.api.services;

import com.modern.api.generated.types.Product;
import com.modern.api.generated.types.Tag;
import com.modern.api.generated.types.TagInput;
import com.modern.api.repository.Repository;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

private final Repository repository;

public TagServiceImpl(Repository repository) {
        this.repository = repository;
        }

@Override
public Map<String, List<Tag>> getTags(List<String> productIds) {
        return repository.getProductTagMappings(productIds);
        }

@Override
public Product addTags(String productId, List<TagInput> tags) {
        return repository.addTags(productId, tags);
        }
}