package pl.lublin.bonanza.rideschedule.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Rider {
    private final String firstName;
    private final String lastName;
    private final int age;
}
