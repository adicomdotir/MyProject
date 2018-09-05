using Microsoft.EntityFrameworkCore;

namespace mvc.Models
{
    public class MvcMovieContext : DbContext
    {
        public MvcMovieContext (DbContextOptions<MvcMovieContext> options)
            : base(options)
        {
        }

        public DbSet<mvc.Models.Movie> Movie { get; set; }
    }
}