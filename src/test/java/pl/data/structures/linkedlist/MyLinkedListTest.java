package pl.data.structures.linkedlist;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Vasif Mustafayev on 2018-09-01 00:33
 * vmustafayev@gmail.com
 */
public class MyLinkedListTest {

    @Test
    public void add(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
        linkedList.add(11);
        linkedList.add(22);

        assertThat(linkedList.toString()).isEqualTo("[11, 22]");
    }

    @Test
    public void add_oneItem(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);

        assertThat(linkedList.toString()).isEqualTo("[1]");
    }

    @Test
    public void empty(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        assertThat(linkedList.toString()).isEqualTo("[]");
    }

    @Test
    public void add_atBeginningForEmptyList(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1, 0);
        assertThat(linkedList.toString()).isEqualTo("[1]");
    }

    @Test
    public void add_atBeginning(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2, 0);
        assertThat(linkedList.toString()).isEqualTo("[2, 1]");
    }

    @Test
    public void add_atEnd(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2, 1);
        assertThat(linkedList.toString()).isEqualTo("[1, 2]");
    }

    @Test
    public void add_atMiddle(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3, 1);
        assertThat(linkedList.toString()).isEqualTo("[1, 3, 2]");
    }
}
