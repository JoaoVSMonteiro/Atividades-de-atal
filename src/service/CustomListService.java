package service;

public class CustomListService<T> {
    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomListService() {
        elements = (T[]) new Object[10];
        size = 0;
    }


    // Adicionar um jogo à lista
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // Obter um jogo pelo índice
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora do intervalo");
        }
        return elements[index];
    }

    // Remover um jogo pelo índice
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora do intervalo");
        }

        T removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;  // Reduz o tamanho e elimina o último elemento
        return removedElement;
    }

    // Obter o tamanho da lista
    public int size() {
        return size;
    }

    // Verificar se a lista está vazia
    public boolean isEmpty() {
        return size == 0;
    }

    // Aumentar a capacidade do array quando necessário
    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[elements.length * 2];  // dobra o tamanho
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }
}
