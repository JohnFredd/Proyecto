import RiegoOptimo._
import org.scalameter.{Key, Warmer, config}

val standardConfig = config (
  Key.exec.minWarmupRuns := 20,
  Key.exec.maxWarmupRuns := 40,
  Key.exec.benchRuns := 25,
  Key.verbose := false
) withWarmer (Warmer.Default())




// Entradas
val finca2 = fincaAlAzar(2)
val distancia2 = distanciaAlAzar(2)
val programacion2 = Vector(0,1)

val finca3 = fincaAlAzar(3)
val distancia3 = distanciaAlAzar(3)
val programacion3 = Vector(0,1,2)

val finca4 = fincaAlAzar(4)
val distancia4 = distanciaAlAzar(4)
val programacion4 = Vector(0,1,2,3)

val finca5 = fincaAlAzar(5)
val distancia5 = distanciaAlAzar(5)
val programacion5 = Vector(0,1,2,3,4)

val finca10 = fincaAlAzar(10)
val distancia10 = distanciaAlAzar(10)
val programacion10 = Vector(0,1,2,3,4,5,6,7,8,9)

val finca15 = fincaAlAzar(15)
val distancia15 = distanciaAlAzar(15)
val programacion15 = Vector(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14)

val finca30 = fincaAlAzar(30)
val distancia30 = distanciaAlAzar(30)
val programacion30 = Vector(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29)

val finca100 = fincaAlAzar(100)
val distancia100 = distanciaAlAzar(100)
val programacion100 = Vector(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)

val finca500 = fincaAlAzar(500)
val distancia500 = distanciaAlAzar(500)
val programacion500 = Vector(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499)

val finca1000 = fincaAlAzar(1000)
val distancia1000 = distanciaAlAzar(1000)
val programacion1000 = Vector(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500,501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999)


//Funciones con entrada 2

//costoRiegoFinca(finca2, programacion2)
//costoRiegoFincaPar(finca2, programacion2)

//costoMovilidad(finca2, programacion2, distancia2)
//costoMovilidadPar(finca2, programacion2, distancia2)

//generarProgramacionesRiego(finca2)
//generarProgramacionesRiegoPar(finca2)

//ProgramacionRiegoOptimo(finca2, distancia2)
//ProgramacionRiegoOptimoPar(finca2, distancia2)





//Comparaciones con entrada 2

val TScostoRiegoFinca2 = standardConfig measure {
  costoRiegoFinca(finca2, programacion2)
}

val TPcostoRiegoFincaPar2 = standardConfig measure {
  costoRiegoFincaPar(finca2, programacion2)
}

val aceleracionCostoRiego2= TScostoRiegoFinca2.value/TPcostoRiegoFincaPar2.value
    (TScostoRiegoFinca2.value, TPcostoRiegoFincaPar2.value, aceleracionCostoRiego2)



//val TScostoMovilidad2 = standardConfig measure {
  //costoMovilidad(finca2, programacion2, distancia2)
//}

//val TPcostoMovilidadPar2 = standardConfig measure {
 // costoMovilidadPar(finca2, programacion2, distancia2)
//}
//val aceleracionCostoMovilidad2= TScostoMovilidad2.value/TPcostoMovilidadPar2.value
  //  (TScostoMovilidad2.value, TPcostoMovilidadPar2.value, aceleracionCostoMovilidad2)



val TSgenerarProgramacionDeRiego2 = standardConfig measure {
  generarProgramacionesRiego(finca2)
}

val TPgenerarProgramacionDeRiegoPar2 = standardConfig measure {
  generarProgramacionesRiegoPar(finca2)
}

val aceleracionGenerarProgramacionesRiego2= TSgenerarProgramacionDeRiego2.value/TPgenerarProgramacionDeRiegoPar2.value
    (TSgenerarProgramacionDeRiego2.value, TPgenerarProgramacionDeRiegoPar2.value, aceleracionGenerarProgramacionesRiego2)




val TSProgramacionRiegoOptimo2 = standardConfig measure {
  ProgramacionRiegoOptimo(finca2, distancia2)
}

val TSProgramacionRiegoOptimoPar2 = standardConfig measure {
  ProgramacionRiegoOptimo(finca2, distancia2)
}
val aceleracionProgramacionRiegoOptimo2= TSProgramacionRiegoOptimo2.value/TSProgramacionRiegoOptimoPar2.value
    (TSProgramacionRiegoOptimo2.value, TSProgramacionRiegoOptimoPar2.value, aceleracionProgramacionRiegoOptimo2)





//Entrada 3

val TScostoRiegoFinca3 = standardConfig measure {
  costoRiegoFinca(finca3, programacion3)
}

val TPcostoRiegoFincaPar3 = standardConfig measure {
  costoRiegoFincaPar(finca3, programacion3)
}

val aceleracionCostoRiego3= TScostoRiegoFinca3.value/TPcostoRiegoFincaPar3.value
(TScostoRiegoFinca3.value, TPcostoRiegoFincaPar3.value, aceleracionCostoRiego3)

//val TScostoMovilidad3 = standardConfig measure {
//costoMovilidad(finca3, programacion3, distancia3)
//}

//val TPcostoMovilidadPar3 = standardConfig measure {
// costoMovilidadPar(finca3, programacion3, distancia3)
//}
//val aceleracionCostoMovilidad3= TScostoMovilidad3.value/TPcostoMovilidadPar3.value
// (TScostoMovilidad3.value, TPcostoMovilidadPar3.value, aceleracionCostoMovilidad3)

val TSgenerarProgramacionDeRiego3 = standardConfig measure {
  generarProgramacionesRiego(finca3)
}

val TPgenerarProgramacionDeRiegoPar3 = standardConfig measure {
  generarProgramacionesRiegoPar(finca3)
}

val aceleracionGenerarProgramacionesRiego3= TSgenerarProgramacionDeRiego3.value/TPgenerarProgramacionDeRiegoPar3.value
(TSgenerarProgramacionDeRiego3.value, TPgenerarProgramacionDeRiegoPar3.value, aceleracionGenerarProgramacionesRiego3)

val TSProgramacionRiegoOptimo3 = standardConfig measure {
  ProgramacionRiegoOptimo(finca3, distancia3)
}

val TSProgramacionRiegoOptimoPar3 = standardConfig measure {
  ProgramacionRiegoOptimo(finca3, distancia3)
}
val aceleracionProgramacionRiegoOptimo3= TSProgramacionRiegoOptimo3.value/TSProgramacionRiegoOptimoPar3.value
(TSProgramacionRiegoOptimo3.value, TSProgramacionRiegoOptimoPar3.value, aceleracionProgramacionRiegoOptimo3)





//Entrada 4
val TScostoRiegoFinca4 = standardConfig measure {
  costoRiegoFinca(finca4, programacion4)
}

val TPcostoRiegoFincaPar4 = standardConfig measure {
  costoRiegoFincaPar(finca4, programacion4)
}

val aceleracionCostoRiego4= TScostoRiegoFinca4.value/TPcostoRiegoFincaPar4.value
(TScostoRiegoFinca4.value, TPcostoRiegoFincaPar4.value, aceleracionCostoRiego4)

//val TScostoMovilidad4 = standardConfig measure {
//costoMovilidad(finca4, programacion4, distancia4)
//}

//val TPcostoMovilidadPar4 = standardConfig measure {
// costoMovilidadPar(finca4, programacion4, distancia4)
//}
//val aceleracionCostoMovilidad4= TScostoMovilidad4.value/TPcostoMovilidadPar4.value
// (TScostoMovilidad4.value, TPcostoMovilidadPar4.value, aceleracionCostoMovilidad4)

val TSgenerarProgramacionDeRiego4 = standardConfig measure {
  generarProgramacionesRiego(finca4)
}

val TPgenerarProgramacionDeRiegoPar4 = standardConfig measure {
  generarProgramacionesRiegoPar(finca4)
}

val aceleracionGenerarProgramacionesRiego4= TSgenerarProgramacionDeRiego4.value/TPgenerarProgramacionDeRiegoPar4.value
(TSgenerarProgramacionDeRiego4.value, TPgenerarProgramacionDeRiegoPar4.value, aceleracionGenerarProgramacionesRiego4)

val TSProgramacionRiegoOptimo4 = standardConfig measure {
  ProgramacionRiegoOptimo(finca4, distancia4)
}

val TSProgramacionRiegoOptimoPar4 = standardConfig measure {
  ProgramacionRiegoOptimo(finca4, distancia4)
}
val aceleracionProgramacionRiegoOptimo4= TSProgramacionRiegoOptimo4.value/TSProgramacionRiegoOptimoPar4.value
(TSProgramacionRiegoOptimo4.value, TSProgramacionRiegoOptimoPar4.value, aceleracionProgramacionRiegoOptimo4)


//Entrada 5

val TScostoRiegoFinca5 = standardConfig measure {
  costoRiegoFinca(finca5, programacion5)
}

val TPcostoRiegoFincaPar5 = standardConfig measure {
  costoRiegoFincaPar(finca5, programacion5)
}

val aceleracionCostoRiego5= TScostoRiegoFinca5.value/TPcostoRiegoFincaPar5.value
(TScostoRiegoFinca5.value, TPcostoRiegoFincaPar5.value, aceleracionCostoRiego5)

//val TScostoMovilidad5 = standardConfig measure {
//costoMovilidad(finca5, programacion5, distancia5)
//}

//val TPcostoMovilidadPar5 = standardConfig measure {
// costoMovilidadPar(finca5, programacion5, distancia5)
//}
//val aceleracionCostoMovilidad5= TScostoMovilidad5.value/TPcostoMovilidadPar5.value
// (TScostoMovilidad5.value, TPcostoMovilidadPar5.value, aceleracionCostoMovilidad5)

val TSgenerarProgramacionDeRiego5 = standardConfig measure {
  generarProgramacionesRiego(finca5)
}

val TPgenerarProgramacionDeRiegoPar5 = standardConfig measure {
  generarProgramacionesRiegoPar(finca5)
}

val aceleracionGenerarProgramacionesRiego5= TSgenerarProgramacionDeRiego5.value/TPgenerarProgramacionDeRiegoPar5.value
(TSgenerarProgramacionDeRiego5.value, TPgenerarProgramacionDeRiegoPar5.value, aceleracionGenerarProgramacionesRiego5)

val TSProgramacionRiegoOptimo5 = standardConfig measure {
  ProgramacionRiegoOptimo(finca5, distancia5)
}

val TSProgramacionRiegoOptimoPar5 = standardConfig measure {
  ProgramacionRiegoOptimo(finca5, distancia5)
}
val aceleracionProgramacionRiegoOptimo5= TSProgramacionRiegoOptimo5.value/TSProgramacionRiegoOptimoPar5.value
(TSProgramacionRiegoOptimo5.value, TSProgramacionRiegoOptimoPar5.value, aceleracionProgramacionRiegoOptimo5)


//Entrada 10

val TScostoRiegoFinca10 = standardConfig measure {
  costoRiegoFinca(finca10, programacion10)
}

val TPcostoRiegoFincaPar10 = standardConfig measure {
  costoRiegoFincaPar(finca10, programacion10)
}

val aceleracionCostoRiego10= TScostoRiegoFinca10.value/TPcostoRiegoFincaPar10.value
(TScostoRiegoFinca10.value, TPcostoRiegoFincaPar10.value, aceleracionCostoRiego10)

//val TScostoMovilidad10 = standardConfig measure {
//costoMovilidad(finca10, programacion10, distancia10)
//}

//val TPcostoMovilidadPar10 = standardConfig measure {
// costoMovilidadPar(finca10, programacion10, distancia10)
//}
//val aceleracionCostoMovilidad10= TScostoMovilidad10.value/TPcostoMovilidadPar10.value
// (TScostoMovilidad10.value, TPcostoMovilidadPar10.value, aceleracionCostoMovilidad10)

val TSgenerarProgramacionDeRiego10 = standardConfig measure {
  generarProgramacionesRiego(finca10)
}

val TPgenerarProgramacionDeRiegoPar10 = standardConfig measure {
  generarProgramacionesRiegoPar(finca10)
}

val aceleracionGenerarProgramacionesRiego10= TSgenerarProgramacionDeRiego10.value/TPgenerarProgramacionDeRiegoPar10.value
(TSgenerarProgramacionDeRiego10.value, TPgenerarProgramacionDeRiegoPar10.value, aceleracionGenerarProgramacionesRiego10)

val TSProgramacionRiegoOptimo10 = standardConfig measure {
  ProgramacionRiegoOptimo(finca10, distancia10)
}

val TSProgramacionRiegoOptimoPar10 = standardConfig measure {
  ProgramacionRiegoOptimo(finca10, distancia10)
}
val aceleracionProgramacionRiegoOptimo10= TSProgramacionRiegoOptimo10.value/TSProgramacionRiegoOptimoPar10.value
(TSProgramacionRiegoOptimo10.value, TSProgramacionRiegoOptimoPar10.value, aceleracionProgramacionRiegoOptimo10)


//Entrada 15

val TScostoRiegoFinca15 = standardConfig measure {
  costoRiegoFinca(finca15, programacion15)
}

val TPcostoRiegoFincaPar15 = standardConfig measure {
  costoRiegoFincaPar(finca15, programacion15)
}

val aceleracionCostoRiego15= TScostoRiegoFinca15.value/TPcostoRiegoFincaPar15.value
(TScostoRiegoFinca15.value, TPcostoRiegoFincaPar15.value, aceleracionCostoRiego15)

//val TScostoMovilidad15 = standardConfig measure {
//costoMovilidad(finca15, programacion15, distancia15)
//}

//val TPcostoMovilidadPar15 = standardConfig measure {
// costoMovilidadPar(finca15, programacion15, distancia15)
//}
//val aceleracionCostoMovilidad15= TScostoMovilidad15.value/TPcostoMovilidadPar15.value
// (TScostoMovilidad15.value, TPcostoMovilidadPar15.value, aceleracionCostoMovilidad15)

val TSgenerarProgramacionDeRiego15 = standardConfig measure {
  generarProgramacionesRiego(finca15)
}

val TPgenerarProgramacionDeRiegoPar15 = standardConfig measure {
  generarProgramacionesRiegoPar(finca15)
}

val aceleracionGenerarProgramacionesRiego15= TSgenerarProgramacionDeRiego15.value/TPgenerarProgramacionDeRiegoPar15.value
(TSgenerarProgramacionDeRiego15.value, TPgenerarProgramacionDeRiegoPar15.value, aceleracionGenerarProgramacionesRiego15)

val TSProgramacionRiegoOptimo15 = standardConfig measure {
  ProgramacionRiegoOptimo(finca15, distancia15)
}

val TSProgramacionRiegoOptimoPar15 = standardConfig measure {
  ProgramacionRiegoOptimo(finca15, distancia15)
}
val aceleracionProgramacionRiegoOptimo15= TSProgramacionRiegoOptimo15.value/TSProgramacionRiegoOptimoPar15.value
(TSProgramacionRiegoOptimo15.value, TSProgramacionRiegoOptimoPar15.value, aceleracionProgramacionRiegoOptimo15)



//Entrada 30

val TScostoRiegoFinca30 = standardConfig measure {
  costoRiegoFinca(finca30, programacion30)
}

val TPcostoRiegoFincaPar30 = standardConfig measure {
  costoRiegoFincaPar(finca30, programacion30)
}

val aceleracionCostoRiego30= TScostoRiegoFinca30.value/TPcostoRiegoFincaPar30.value
(TScostoRiegoFinca30.value, TPcostoRiegoFincaPar30.value, aceleracionCostoRiego30)

//val TScostoMovilidad30 = standardConfig measure {
//costoMovilidad(finca30, programacion30, distancia30)
//}

//val TPcostoMovilidadPar30 = standardConfig measure {
// costoMovilidadPar(finca30, programacion30, distancia30)
//}
//val aceleracionCostoMovilidad30= TScostoMovilidad30.value/TPcostoMovilidadPar30.value
// (TScostoMovilidad30.value, TPcostoMovilidadPar30.value, aceleracionCostoMovilidad30)

val TSgenerarProgramacionDeRiego30 = standardConfig measure {
  generarProgramacionesRiego(finca30)
}

val TPgenerarProgramacionDeRiegoPar30 = standardConfig measure {
  generarProgramacionesRiegoPar(finca30)
}

val aceleracionGenerarProgramacionesRiego30= TSgenerarProgramacionDeRiego30.value/TPgenerarProgramacionDeRiegoPar30.value
(TSgenerarProgramacionDeRiego30.value, TPgenerarProgramacionDeRiegoPar30.value, aceleracionGenerarProgramacionesRiego30)

val TSProgramacionRiegoOptimo30 = standardConfig measure {
  ProgramacionRiegoOptimo(finca30, distancia30)
}

val TSProgramacionRiegoOptimoPar30 = standardConfig measure {
  ProgramacionRiegoOptimo(finca30, distancia30)
}
val aceleracionProgramacionRiegoOptimo30= TSProgramacionRiegoOptimo30.value/TSProgramacionRiegoOptimoPar30.value
(TSProgramacionRiegoOptimo30.value, TSProgramacionRiegoOptimoPar30.value, aceleracionProgramacionRiegoOptimo30)



//Entrada 100

val TScostoRiegoFinca100 = standardConfig measure {
  costoRiegoFinca(finca100, programacion100)
}

val TPcostoRiegoFincaPar100 = standardConfig measure {
  costoRiegoFincaPar(finca100, programacion100)
}

val aceleracionCostoRiego100= TScostoRiegoFinca100.value/TPcostoRiegoFincaPar100.value
(TScostoRiegoFinca100.value, TPcostoRiegoFincaPar100.value, aceleracionCostoRiego100)

//val TScostoMovilidad100 = standardConfig measure {
//costoMovilidad(finca100, programacion100, distancia100)
//}

//val TPcostoMovilidadPar100 = standardConfig measure {
// costoMovilidadPar(finca100, programacion100, distancia100)
//}
//val aceleracionCostoMovilidad100= TScostoMovilidad100.value/TPcostoMovilidadPar100.value
// (TScostoMovilidad100.value, TPcostoMovilidadPar100.value, aceleracionCostoMovilidad100)

val TSgenerarProgramacionDeRiego100 = standardConfig measure {
  generarProgramacionesRiego(finca100)
}

val TPgenerarProgramacionDeRiegoPar100 = standardConfig measure {
  generarProgramacionesRiegoPar(finca100)
}

val aceleracionGenerarProgramacionesRiego100= TSgenerarProgramacionDeRiego100.value/TPgenerarProgramacionDeRiegoPar100.value
(TSgenerarProgramacionDeRiego100.value, TPgenerarProgramacionDeRiegoPar100.value, aceleracionGenerarProgramacionesRiego100)

val TSProgramacionRiegoOptimo100 = standardConfig measure {
  ProgramacionRiegoOptimo(finca100, distancia100)
}

val TSProgramacionRiegoOptimoPar100 = standardConfig measure {
  ProgramacionRiegoOptimo(finca100, distancia100)
}
val aceleracionProgramacionRiegoOptimo100= TSProgramacionRiegoOptimo100.value/TSProgramacionRiegoOptimoPar100.value
(TSProgramacionRiegoOptimo100.value, TSProgramacionRiegoOptimoPar100.value, aceleracionProgramacionRiegoOptimo100)


//Entrada 500

val TScostoRiegoFinca500 = standardConfig measure {
  costoRiegoFinca(finca500, programacion500)
}

val TPcostoRiegoFincaPar500 = standardConfig measure {
  costoRiegoFincaPar(finca500, programacion500)
}

val aceleracionCostoRiego500= TScostoRiegoFinca500.value/TPcostoRiegoFincaPar500.value
(TScostoRiegoFinca500.value, TPcostoRiegoFincaPar500.value, aceleracionCostoRiego500)

//val TScostoMovilidad500 = standardConfig measure {
//costoMovilidad(finca500, programacion500, distancia500)
//}

//val TPcostoMovilidadPar500 = standardConfig measure {
// costoMovilidadPar(finca500, programacion500, distancia500)
//}
//val aceleracionCostoMovilidad500= TScostoMovilidad500.value/TPcostoMovilidadPar500.value
// (TScostoMovilidad500.value, TPcostoMovilidadPar500.value, aceleracionCostoMovilidad500)

val TSgenerarProgramacionDeRiego500 = standardConfig measure {
  generarProgramacionesRiego(finca500)
}

val TPgenerarProgramacionDeRiegoPar500 = standardConfig measure {
  generarProgramacionesRiegoPar(finca500)
}

val aceleracionGenerarProgramacionesRiego500= TSgenerarProgramacionDeRiego500.value/TPgenerarProgramacionDeRiegoPar500.value
(TSgenerarProgramacionDeRiego500.value, TPgenerarProgramacionDeRiegoPar500.value, aceleracionGenerarProgramacionesRiego500)

val TSProgramacionRiegoOptimo500 = standardConfig measure {
  ProgramacionRiegoOptimo(finca500, distancia500)
}

val TSProgramacionRiegoOptimoPar500 = standardConfig measure {
  ProgramacionRiegoOptimo(finca500, distancia500)
}
val aceleracionProgramacionRiegoOptimo500= TSProgramacionRiegoOptimo500.value/TSProgramacionRiegoOptimoPar500.value
(TSProgramacionRiegoOptimo500.value, TSProgramacionRiegoOptimoPar500.value, aceleracionProgramacionRiegoOptimo500)


//Entrada 1000

val TScostoRiegoFinca1000 = standardConfig measure {
  costoRiegoFinca(finca1000, programacion1000)
}

val TPcostoRiegoFincaPar1000 = standardConfig measure {
  costoRiegoFincaPar(finca1000, programacion1000)
}

val aceleracionCostoRiego1000= TScostoRiegoFinca1000.value/TPcostoRiegoFincaPar1000.value
(TScostoRiegoFinca1000.value, TPcostoRiegoFincaPar1000.value, aceleracionCostoRiego1000)

//val TScostoMovilidad1000 = standardConfig measure {
//costoMovilidad(finca1000, programacion1000, distancia1000)
//}

//val TPcostoMovilidadPar1000 = standardConfig measure {
// costoMovilidadPar(finca1000, programacion1000, distancia1000)
//}
//val aceleracionCostoMovilidad1000= TScostoMovilidad1000.value/TPcostoMovilidadPar1000.value
// (TScostoMovilidad1000.value, TPcostoMovilidadPar1000.value, aceleracionCostoMovilidad1000)

val TSgenerarProgramacionDeRiego1000 = standardConfig measure {
  generarProgramacionesRiego(finca1000)
}

val TPgenerarProgramacionDeRiegoPar1000 = standardConfig measure {
  generarProgramacionesRiegoPar(finca1000)
}

val aceleracionGenerarProgramacionesRiego1000= TSgenerarProgramacionDeRiego1000.value/TPgenerarProgramacionDeRiegoPar1000.value
(TSgenerarProgramacionDeRiego1000.value, TPgenerarProgramacionDeRiegoPar1000.value, aceleracionGenerarProgramacionesRiego1000)

val TSProgramacionRiegoOptimo1000 = standardConfig measure {
  ProgramacionRiegoOptimo(finca1000, distancia1000)
}

val TSProgramacionRiegoOptimoPar1000 = standardConfig measure {
  ProgramacionRiegoOptimo(finca1000, distancia1000)
}
val aceleracionProgramacionRiegoOptimo1000= TSProgramacionRiegoOptimo1000.value/TSProgramacionRiegoOptimoPar1000.value
(TSProgramacionRiegoOptimo1000.value, TSProgramacionRiegoOptimoPar1000.value, aceleracionProgramacionRiegoOptimo1000)













/*
val finca = fincaAlAzar(5)
val distancia = distanciaAlAzar(5)
val programacion = Vector(0,1,4,2,3)

//costoMovilidad(finca, programacion, distancia)

/*def costoMovilidad(f: Finca, pi: ProgRiego, d: Distancia): Int = {
  var totalCost = 0

  for (j <- 0 until f.length - 1) {
    val tablonActual = pi(j)
    val tablonSiguiente = pi(j + 1)
    val costoMovimiento = d(tablonActual)(tablonSiguiente)
    totalCost += costoMovimiento
  }

  totalCost
}

 */


val finca: Finca = Vector(
  (10, 1, 2),
  (7, 5, 5), 
  (4, 4, 3),
  (6, 3, 3),
  (8, 4, 2)
)


val distancia: Distancia = Vector(
  Vector(0, 2, 2, 4, 4),
  Vector(2, 0, 4, 2, 6),
  Vector(2, 4, 0, 2, 2),
  Vector(4, 2, 2, 0, 4),
  Vector(4, 6, 2, 4, 0)
)


/*
val programacion: ProgRiego = Vector(0, 1, 2, 3, 4)
tIR(finca, programacion)
*/


/*
costoRiegoTablon(1, finca, programacion)
costoRiegoFinca(finca, programacion)
*/


//costoMovilidadPar(finca, programacion, distancia)
/*
costoMovilidad(finca, programacion, distancia)
costoMovilidadPar(finca,programacion, distancia)
*/


/*
generarProgramacionesRiego(finca).length
ProgramacionRiegoOptimo(finca, distancia)
*/


val programacion2: ProgRiego = Vector(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500,501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999)
val fincaAlAzar2 = fincaAlAzar(3)
val distanciaAlAzar1 = distanciaAlAzar(3)

//generarProgramacionesRiego(finca)
ProgramacionRiegoOptimo(fincaAlAzar2, distanciaAlAzar1)

//generarProgramacionesRiegoPar(finca)
ProgramacionRiegoOptimoPar(fincaAlAzar2, distanciaAlAzar1)
generarProgramacionesRiego(fincaAlAzar2)
generarProgramacionesRiegoPar(fincaAlAzar2)


//standardConfig measure(generarProgramacionesRiego(finca))
val standardConfig = config(
  Key.exec.minWarmupRuns := 20,
  Key.exec.maxWarmupRuns := 40,
  Key.exec.benchRuns := 25,
  Key.verbose := false
) withWarmer (Warmer.Default())


val tiempoSeq = standardConfig measure {
  generarProgramacionesRiego(fincaAlAzar2)
}

val tiempoPar = standardConfig measure {
generarProgramacionesRiegoPar(fincaAlAzar2)
}


val tiempoSeq1 = standardConfig measure {
  ProgramacionRiegoOptimo(fincaAlAzar2,distanciaAlAzar1)
}

val tiempoPar1 = standardConfig measure {
  ProgramacionRiegoOptimoPar(fincaAlAzar2,distanciaAlAzar1)
}
*/



