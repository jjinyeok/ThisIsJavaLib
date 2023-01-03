package ch12.sec03.exam01;

public class Member {

    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Member target) {
            if(target.id == id) {
                return true;
            }
        }
        return false;
    }

}
