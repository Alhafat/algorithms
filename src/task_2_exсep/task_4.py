import string


def validate_empty_string():
    while True:
        value = input("Введите пустую строку: \n")
        if value == "":
            print("Получена пустая строка, спасибо за участие!")
            break
        else:
            print("Условие выполнено некорректно, попробуйте еще раз!")


def main():
    validate_empty_string()


if __name__ == '__main__':
    main()
