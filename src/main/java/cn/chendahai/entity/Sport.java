package cn.chendahai.entity;

/**
 * 功能描述
 *
 * @author chy
 * @date 2020/3/28 0028
 */
public class Sport {

    private Integer id;

    private String name;

    public Sport() {
    }

    public Sport(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sport{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
