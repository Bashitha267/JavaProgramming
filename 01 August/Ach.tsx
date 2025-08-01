import { motion } from "framer-motion";
import { Award } from "lucide-react";

const Achievements = () => {
  // const achievements = [
  //   {
  //     title: "Kubernetes and Cloud Native Associate (KCNA)",
  //     description:
  //       "Self-studied and successfully cracked the KCNA certification with a 95% score in first try, demonstrating strong fundamentals in Kubernetes, cloud-native technologies, and container orchestration.",
  //   },
  //   {
  //     title: "Best Performer Award at Livlong",
  //     description:
  //       "Recognized for outstanding contributions, leadership, and impact on critical projects.",
  //   },

  //   {
  //     title: "Deployed a 3-Tier Application on AWS with Kubernetes",
  //     description:
  //       "Built and deployed a scalable 3-tier application on Kubernetes, enabling seamless microservice communication. Used AWS EC2, Ingress Controller, and container orchestration for high availability.",
  //   },
  // ];

  return (
    <section
      id="achievements"
      className="py-20 text-white relative overflow-hidden"
    >
      <motion.div
        className="absolute inset-0 opacity-5"
        animate={{
          scale: [1, 1.2, 1],
          rotate: [0, 180, 360],
        }}
        transition={{
          duration: 20,
          repeat: Infinity,
          ease: "linear",
        }}
        style={{
          backgroundImage:
            "radial-gradient(circle at center, purple 0%, transparent 70%)",
          backgroundSize: "100% 100%",
        }}
      />
      <div className="container mx-auto px-4 relative z-10">
        <motion.h2
          initial={{ opacity: 0, y: 50 }}
          whileInView={{ opacity: 1, y: 0 }}
          viewport={{ once: false }}
          transition={{ duration: 0.6 }}
          className="text-4xl font-bold mb-12 text-center flex items-center justify-center gap-3"
        >
          <Award className="text-purple-400" /> Achievements
        </motion.h2>

        {/* <div className="grid md:grid-cols-3 gap-8">
          {achievements.map((achievement, index) => (
            <motion.div
              key={index}
              initial={{ opacity: 0, rotateY: -180 }}
              whileInView={{ opacity: 1, rotateY: 0 }}
              whileHover={{
                scale: 1.05,
                rotateY: 10,
                boxShadow: "0 0 30px rgba(147, 51, 234, 0.3)",
              }}
              viewport={{ once: false, margin: "-50px" }}
              transition={{
                duration: 0.8,
                type: "spring",
                stiffness: 100,
              }}
              className="bg-gray-800 p-6 rounded-lg text-center transform-gpu"
            >
              <Medal className="w-12 h-12 mx-auto mb-4 text-purple-400" />
              <h3 className="text-xl font-bold mb-2">{achievement.title}</h3>
              <p className="text-gray-400">{achievement.description}</p>
            </motion.div>
          ))}
        </div> */}
      </div>
    </section>
  );
};

export default Achievements;