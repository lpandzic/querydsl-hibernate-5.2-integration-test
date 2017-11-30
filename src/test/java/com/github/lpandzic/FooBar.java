package com.github.lpandzic;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
class FooBar {

    @Id
    @Column
    private String id;
}
