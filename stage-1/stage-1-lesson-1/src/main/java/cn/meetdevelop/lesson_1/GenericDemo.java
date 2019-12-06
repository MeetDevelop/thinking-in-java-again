package cn.meetdevelop;

import java.util.Collections;
import java.util.List;

/**
 * @author zgy
 * @DATE 2019/12/4 - 19:18
 */
public class GenericDemo {

    /**
     * @param <S> source type
     * @param <T> convert type
     */
    public interface Converter<S, T> {

        T convert(S s);
    }

    public static void main(String[] args) {
        List<Integer> list = Collections.emptyList();

        List<String> list1 = Collections.emptyList();

        List list2 = list1;
        Converter<String, Integer> converter = new Converter<String, Integer>() {
            @Override
            public Integer convert(String s) {
                return Integer.valueOf(s);
            }
        };
    }


}
