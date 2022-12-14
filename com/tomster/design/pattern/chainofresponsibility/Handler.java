package com.tomster.design.pattern.chainofresponsibility;

/**
 * @author meihewang
 * @date 2022/12/14  18:00
 */
public abstract class Handler<T> {
    protected Handler<T> next;

    public abstract void doHandler(T t);

    public void process(T t) {
        doHandler(t);
        if (next != null) {
            next.process(t);
        }
    }


    public void setNext(Handler<T> next) {
        this.next = next;
    }

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
            } else {
                this.tail.next = handler;
                this.tail = handler;
            }
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}
