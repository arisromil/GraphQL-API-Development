package com.modern.api.dataloaders;

import com.netflix.graphql.dgs.DgsDataLoader;
import com.modern.api.generated.types.Tag;
import com.modern.api.services.TagService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.dataloader.BatchLoaderEnvironment;
import org.dataloader.MappedBatchLoaderWithContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@DgsDataLoader(name = "tagsWithContext")
public class TagsDataloaderWithContext implements MappedBatchLoaderWithContext<String, List<Tag>> {

    private final Logger LOG = LoggerFactory.getLogger(getClass());
    private final TagService tagService;

    public TagsDataloaderWithContext(TagService tagService) {
        this.tagService = tagService;
    }

    @Override
    public CompletionStage<Map<String, List<Tag>>> load(Set<String> keys,
                                                        BatchLoaderEnvironment environment) {
        LOG.info("Tags will be fetched for following product IDs: {}", keys);
        return CompletableFuture.supplyAsync(() -> tagService.getTags(new ArrayList<>(keys)));
    }
}