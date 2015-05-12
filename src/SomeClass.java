/**
 * Created by sbelokon on 5/12/15.
 */
public class SomeClass {
    public int getSomeId() {
        return someId;
    }

    public void setSomeId(int someId) {
        this.someId = someId;
    }
xchxc
    public int getSomeNumber() {
        return someNumber;
    }
]]




    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }

    public int someId;
    public int someNumber;

    public SomeClass() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SomeClass)) return false;

        SomeClass someClass = (SomeClass) o;

        if (someId != someClass.someId) return false;
        if (someNumber != someClass.someNumber) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = someId;
        result = 31 * result + someNumber;
        return result;
    }
}
