
#Write a program to solve Tower of Hanoi Problem.

def movetower(height , FromPole , ToPole , WithPole):
    if height >= 1:
        movetower(height - 1 , FromPole , WithPole , ToPole)
        movedisk(FromPole , ToPole)
        movetower(height - 1 , WithPole , ToPole , FromPole)

def movedisk(fp , tp):
    print(f"Moving disk from {fp} to {tp}")

movetower(4 , "A" , "B" , "C")
