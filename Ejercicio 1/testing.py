import unittest
import ejercicio


class Test(unittest.TestCase):

    def test(self):
        self.assertEqual(ejercicio.suma(5), 15)

if __name__ == "__main__":
    unittest.main()
