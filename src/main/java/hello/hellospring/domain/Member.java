package hello.hellospring.domain;

import javax.persistence.*;

@Entity

// oracel
@SequenceGenerator(
    name = "MEM_SEQ_GER",
    sequenceName = "MEM_SEQ",
    initialValue = 1,
    allocationSize = 1
)

public class Member {

//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)   // h2
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEM_SEQ_GER")  // oracle
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
