import { Navigate, Route, Routes } from "react-router-dom";
import { lazy } from "react";

import UserLayout from "./pages/user/UserLayout";
import AdminLayout from "./pages/admin/AdminLayout";

const LazyLayout = lazy(() => import("./components/ui/LazyLayout"))

const LazyLogin = lazy(() => import("./pages/auth/Login"));
const LazySignUp = lazy(() => import("./pages/auth/SignUp"));
const LazyForgotPassword = lazy(() => import("./pages/auth/Forgotpassword"))

const LazyDashboard = lazy(() => import("./pages/admin/DashBoard"));
const LazyInfo = lazy(() => import("./pages/admin/UserInfo"));

const LazyHome = lazy(() => import("./pages/user/Home"));
const LazyAbout = lazy(() => import("./pages/user/About"));

const UserRoutes = () => {
  return (
    <UserLayout>
      <Routes>
        <Route path="/home" element={<LazyLayout component={LazyHome} />} />
        <Route path="/about" element={<LazyLayout component={LazyAbout} />} />
      </Routes>
    </UserLayout>
  );
};

const AdminRoutes = () => {
  return (
    <AdminLayout>
      <Routes>
        <Route
          path="/dashboard"
          element={<LazyLayout component={LazyDashboard} />}
        />
        <Route 
          path="/info" 
          element={<LazyLayout component={LazyInfo} />} 
        />
      </Routes>
    </AdminLayout>
  );
};

function App() {
  return (
    <Routes>
      <Route path="/" element={<Navigate to="/login" />} />
      <Route path="/login" element={<LazyLayout component={LazyLogin} />} />
      <Route path="/signup" element={<LazyLayout component={LazySignUp} />} />
      <Route path="/forgotpassword" element={<LazyLayout component={LazyForgotPassword} />} />
      <Route path="/user/*" element={<UserRoutes />} />
      <Route path="/admin/*" element={<AdminRoutes />} />
    </Routes>
  );
}

export default App;
