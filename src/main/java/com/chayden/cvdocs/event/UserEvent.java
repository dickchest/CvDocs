package com.chayden.cvdocs.event;

import com.chayden.cvdocs.entity.UserEntity;
import com.chayden.cvdocs.enumaration.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class UserEvent {
    private UserEntity user;
    private EventType type;
    private Map<?, ?> data;
}
