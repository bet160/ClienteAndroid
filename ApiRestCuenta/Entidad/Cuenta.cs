﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace ApiRestCuenta.Entidad
{
    public class Cuenta
    {
        [Key]
        public int id { get; set; }
        public string nombreUsuario { get; set; }
        public string correoElectronico { get; set; }
        public string contraseña { get; set; }
        public string tipo { get; set; }
    }
}
