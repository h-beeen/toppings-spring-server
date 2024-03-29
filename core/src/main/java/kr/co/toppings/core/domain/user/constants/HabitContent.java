package kr.co.toppings.core.domain.user.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum HabitContent {

    // Diet
    Vegan("Vegan"),
    Vegetarian("Vegetarian"),
    Lowcarb("Low carb"),
    Nosugar("No sugar"),
    Muslimfriendly("Muslim friendly"),
    Halal("Halal"),

    // Religion
    Buddhism("Buddhism"),
    Hinduism("Hinduism"),
    ;

    private final String name;
}
