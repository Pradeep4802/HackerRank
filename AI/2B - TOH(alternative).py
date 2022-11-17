def TOH(numbers , start , aux , end):
    if numbers == 1:
        print(f"Move disk 1 from rod {start} to rod {end}")
        return
    TOH(numbers - 1 , start , end , aux)
    print(f"Move {numbers} from rod {start} to rod {end}")
    TOH(numbers - 1 , aux , start , end)

TOH(3 , "A" , "B" , "C")