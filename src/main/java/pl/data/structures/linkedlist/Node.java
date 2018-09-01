package pl.data.structures.linkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Vasif Mustafayev on 2018-08-31 23:59
 * vmustafayev@gmail.com
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
class Node<T> {
    private T data;
    private Node<T> next;

    Node(T data) {
        this.data = data;
    }
}
