package com.dreamik.myboard2024.connectionTest;

import com.dreamik.myboard2024.repository.ExampleRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@RequiredArgsConstructor
@Getter
@Setter
@Slf4j
public class TestDataInit {
    private final ExampleRepository exampleRepository;
    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        log.info("init data/ test data");
//        exampleRepository
    }
}
