import React, { Component, Suspense } from "react";
import PropeType from "prop-types";
import "../../assets/css/loading.css";

const Loader = () => {
  return (
    <div className="load">
      <div class="loadingio-spinner-ripple-n3ipp3pz9da">
        <div class="ldio-9deg5v22n5f">
          <div></div>
          <div></div>
        </div>
      </div>
    </div>
  );
};

function LazyLayout({ component: Component, ...rest }) {
  return (
    <Suspense fallback={<Loader />}>
      <Component {...rest} />
    </Suspense>
  );
}
LazyLayout.propeType = {
  Component: PropeType.elementType.isRequired,
};
export default LazyLayout;
