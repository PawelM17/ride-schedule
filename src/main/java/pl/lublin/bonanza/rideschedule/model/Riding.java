package pl.lublin.bonanza.rideschedule.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Riding {
    private final Rider rider;
    private final Horse horse;
    private final double minutes;
}
