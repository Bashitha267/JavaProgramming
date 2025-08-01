import { motion } from "framer-motion";
import { ExternalLink } from "lucide-react";

const Projects = () => {
  const projects = [
    {
      id: 1,
      title: "Elysiaan Bites",
      description:
        "I created a restaurant website with a user-friendly design and seamless functionality, showcasing my web development skills. It highlights my ability to build dynamic and responsive applications.",
      image: "https://res.cloudinary.com/dnfbik3if/image/upload/v1740296500/Pink_minimal_new_website_instagram_post_500_x_500_px_1000_x_1000_px_ramjhe.jpg",
      link: "https://www.linkedin.com/posts/nimesh-bashitha-a87b2a33a_fullstackdevelopment-reactjs-nodejs-activity-7291322013766279169-Y50Q?utm_source=share&utm_medium=member_desktop&rcm=ACoAAFU9j4cBQ1Fc7ozQxEhJ6V58TUcH-8smueA",
    },
    {
      id: 2,
      title: "Portfolio",
      description:
        "My portfolio website showcases my skills and projects using React and React 3D models, creating an interactive and visually engaging experience. It highlights my expertise in full-stack development and passion for building dynamic web applications",
      image: "https://res.cloudinary.com/dnfbik3if/image/upload/v1744824052/Screenshot_2025-04-16_225033_zjun9w.png",
      link: "https://nimeshbashitha.netlify.app/",
    },
    {
      id: 3,
      title: "Fashora",
      description:"Fashora is a dynamic e-commerce website offering a wide variety of clothing for women, men, and kids, along with other fashionable items. Designed with a vibrant orange theme, the site provides a seamless shopping experience. Built with React, Node.js, and Tailwind CSS, Fashora delivers a modern and responsive platform for users to explore the latest fashion trends with ease.",
      image: "https://res.cloudinary.com/dnfbik3if/image/upload/v1744824070/Screenshot_2025-04-16_224749_mlw35p.png",
      link: "https://yourfashora.netlify.app/",
    },
    {
      id: 4,
      title: "Slick Styles App",
      description:"This sleek shopping app offers a fully functional e-commerce experience powered by the Fake Store API. Built using React Native with Expo, the app features a clean and intuitive UI for browsing a wide range of products across various categories. Users can explore item details, add products to their cart, and simulate a real shopping experience. Optimized for mobile performance, the app demonstrates core e-commerce functionalities like dynamic routing, state management, and responsive layouts — making it a perfect showcase for full-stack development skills and mobile UI/UX design.",
      image: "https://res.cloudinary.com/dnfbik3if/image/upload/v1749461093/White_Beige_Minimalist_Photoshoot_Fashion_Photo_Collage_iyhbuy.jpg",
      link: "https://www.linkedin.com/posts/nimesh-bashitha_reactnative-mobiledevelopment-expo-activity-7336022269820878848-f0Rs?utm_source=share&utm_medium=member_desktop&rcm=ACoAAFU9j4cBQ1Fc7ozQxEhJ6V58TUcH-8smueA",
      
    },
    {
      id: 5,
      title: "Movie App",
      description:"Movie Explorer is a sleek, cross-platform mobile app built with React Native and Expo, integrating the TMDB (The Movie Database) API to deliver real-time movie data. The app offers an immersive experience for users to explore trending films, search by genre, and view detailed movie and cast information.",
      image: "https://res.cloudinary.com/dnfbik3if/image/upload/v1751431650/White_Beige_Minimalist_Photoshoot_Fashion_Photo_Collage_xcrdb5.jpg",
      link: "https://www.linkedin.com/posts/nimesh-bashitha_movie-explorer-react-native-app-using-activity-7345864493639299074-TTqg?utm_source=share&utm_medium=member_desktop&rcm=ACoAAFU9j4cBQ1Fc7ozQxEhJ6V58TUcH-8smueA",
      
    },
        {
      id: 6,
      title: "Bite POS System",
      description:"BitePOS is a modern restaurant billing system built with React and Supabase, designed for smooth operation on both Windows desktops and touch-based tablets. It features a dynamic order panel with quantity controls, real-time total calculation, and a clean, responsive UI. Optimized for performance and ease of use, BitePOS offers a fast, lightweight solution for managing orders efficiently in restaurant environments.",
      image: "https://res.cloudinary.com/dnfbik3if/image/upload/v1752906830/Screenshot_2025-07-19_115936_pneuf5.png",
      link: "https://bitepos.netlify.app/",
      
    }
  ];

  return (
    <section id="projects" className="py-20 text-white">
      <div className="container mx-auto px-4">
        <motion.h2
          initial={{ opacity: 0, y: 50 }}
          whileInView={{ opacity: 1, y: 0 }}
          viewport={{ once: false }}
          transition={{ duration: 0.6 }}
          className="text-4xl font-bold mb-12 text-center"
        >
          Featured Projects
        </motion.h2>

        <div className="flex flex-wrap justify-center gap-8">
          {projects.map((project) => (
            <motion.div
              key={project.id}
              initial={{ opacity: 0, scale: 0.9 }}
              whileInView={{ opacity: 1, scale: 1 }}
              viewport={{ once: false, margin: "-100px" }}
              transition={{ duration: 0.5 }}
              whileHover={{
                y: -20,
                scale: 1.02,
                transition: { type: "spring", stiffness: 300 },
              }}
              className="bg-gray-800 rounded-lg overflow-hidden transform-gpu max-w-lg"
            >
              <motion.div
                whileHover={{ scale: 1.1 }}
                transition={{ duration: 0.3 }}
                className="overflow-hidden"
              >
                <img
                  src={project.image}
                  alt={project.title}
                  className="w-full h-48 object-cover transform transition-transform duration-500"
                />
              </motion.div>
              <div className="p-6">
                <motion.h3
                  className="text-xl font-semibold mb-2"
                  whileHover={{ x: 10 }}
                >
                  {project.title}
                </motion.h3>
                <p className="text-gray-400 mb-4">{project.description}</p>
                <div className="flex gap-2">
                  <motion.a
                    whileHover={{ scale: 1.1, x: 5 }}
                    whileTap={{ scale: 0.95 }}
                    href={`${project.link}`}
                    target={"_blank"}
                    className="inline-flex items-center gap-2 px-4 py-2 bg-purple-600 rounded-md hover:bg-purple-700 transition-all duration-300"
                  >
                    View Project <ExternalLink size={16} />
                  </motion.a>
                </div>
              </div>
            </motion.div>
          ))}
        </div>
      </div>
    </section>
  );
};

export default Projects;