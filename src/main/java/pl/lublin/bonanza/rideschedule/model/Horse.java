package pl.lublin.bonanza.rideschedule.model;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Horse {
    private final String name;
    private final String race;
}
