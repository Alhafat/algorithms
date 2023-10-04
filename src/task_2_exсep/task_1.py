def validate_float():
    while True:
        try:
            num = float(input("Введите значение типа float: \n"))
            print(f"Получено значение типа float --> ", num)
            break
        except ValueError:
            print("Введено неверное значение, попробуйте еще раз!")


def main():
    validate_float()


if __name__ == '__main__':
    main()
