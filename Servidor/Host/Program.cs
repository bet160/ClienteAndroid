using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Host
{
    class Program
    {
        static void Main(string[] args)
        {
            using (ServiceHost host = new ServiceHost(typeof(ServidorSpotifyChacalon.Servicios)))
            {
                try
                {
                    host.Open();
                    Console.WriteLine("El servidor está arriba");
                    Console.ReadLine();
                }
                catch (SocketException)
                {
                    Console.WriteLine("Error de conexion");
                }
            }
        }
    }
}
