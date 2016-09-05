#Lab 19 work
from Tkinter import *

class TempConverter:
    """
    A simple app for converting from fahrenheit to celsius
    """
    def __init__(self, parent):
        self.celsius_val = Label(parent, text="", width=20)
        self.celsius_val.grid(column=1,row=1)
        self.celsius_label = Label(parent, text="Celsius", width=20)
        self.celsius_label.grid(column=1, row=0)

        self.fahr_input = Entry(parent)
        self.fahr_input.grid(column=0,row=1)
        self.fahr_label = Label(parent, text="Fahrenheit")
        self.fahr_label.grid(column=0, row=0)
        self.convert_button = Button(parent, text="Convert", command=self.convert)
        self.convert_button.grid(row=2, column=0)

        self.quit_button=Button(parent, text="Quit", command=parent.destroy)
        self.quit_button.grid(row=2, column=1)

    def convert(self):
        dfahr = float(self.fahr_input.get())
        celsius = (dfahr-32)*5.0/9.0
        self.celsius_val.configure(text = str(celsius))
        

    def convert_f_to_c(self, fahr):
        """
        Convert from fahrenheit to celsius. The variable self is the
        object parameter.
        Note: when comparing floating values, == is usually inadequate. You
        normally have to test whether two floats are close enough.
        >>> testConvert = TempConverter(Tk())
        >>> c = testConvert.convert_f_to_c(-40)
        >>> abs(c+40.0)<1e-8
        True
        >>> c = testConvert.convert_f_to_c(100)
        >>> abs(c-37.7777777777)<1e-8
        True
        """
        celsius = (fahr-32)*5.0/9.0
        return celsius       

    def convert_c_to_f(self, cels):
        # c * 9/5 + 32
        """
        convert from celsius to fahrenheit. The variable self is the
        object parameter
        >>> testConvert = TempConverter(Tk())
        >>> f = testConvert.convert_f_to_c(100)
        >>> abs(f-37.7777777777)<1e-8
        True
        """
        fahrenheit = ((cels*9)/5 + 32)
        return fahernheit

    
        
import doctest
doctest.testmod()

root = Tk()
app = TempConverter(root)
root.mainloop()






