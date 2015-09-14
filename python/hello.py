from colorama import Fore, Back
import time

name = input("$ ")
print (Fore.WHITE + Back.CYAN + "Hello %s!" % (name) + Fore.RESET + Back.RESET)